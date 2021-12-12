package com.example.ePHI.repositories;

import com.example.ePHI.model.Report;
import com.mongodb.client.result.DeleteResult;
import mongoHelpers.MongoHelper;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.util.Streamable;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReportRepositoryImpl implements ReportRepository {
    private static final String REPORT_PREFIX = "REPORT_";
    private final MongoOperations mongoOperations;
    private final MongoEntityInformation<Report, String> entityInformation;

    public ReportRepositoryImpl(
            MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
        this.entityInformation = MongoHelper.getEntityInformationFor(Report.class, String.class);
    }

    @Override
    public <S extends Report> S save(S entity) {
        if (entity.getId() == null) {
            entity.setId(REPORT_PREFIX + UUID.randomUUID());
        }
        return this.entityInformation.isNew(entity) ? this.mongoOperations.insert(
                entity,
                this.entityInformation.getCollectionName()) : this.mongoOperations.save(
                        entity, this.entityInformation.getCollectionName());
    }

    @Override
    public <S extends Report> List<S> saveAll(Iterable<S> entities) {
        entities.forEach(e -> e.setId(REPORT_PREFIX + UUID.randomUUID()));
        Assert.notNull(entities, "The given Iterable of entities not be null!");
        Streamable<S> source = Streamable.of(entities);
        Stream var10000 = source.stream();
        MongoEntityInformation var10001 = this.entityInformation;
        var10001.getClass();
        boolean allNew = var10000.allMatch(var10001::isNew);
        if (allNew) {
            List<S> result = (List)source.stream().collect(Collectors.toList());
            return new ArrayList(this.mongoOperations.insert(result, this.entityInformation.getCollectionName()));
        } else {
            return (List)source.stream().map(this::save).collect(Collectors.toList());
        }
    }

    @Override
    public Optional<Report> findById(String id) {
        Assert.notNull(id, "The given id must not be null!");
        return Optional.ofNullable(
                this.mongoOperations.findById(id, this.entityInformation.getJavaType(),
                        this.entityInformation.getCollectionName()));
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Report> findAll() {
        return this.findAll(new Query());
    }

    @Override
    public Iterable<Report> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String id) {
        Assert.notNull(id, "The given id must not be null!");
        this.mongoOperations.remove(this.getIdQuery(id), this.entityInformation.getJavaType(), this.entityInformation.getCollectionName());
    }

    @Override
    public void delete(Report entity) {
        Assert.notNull(entity, "The given entity must not be null!");
        DeleteResult deleteResult = this.mongoOperations.remove(entity, this.entityInformation.getCollectionName());
        if (this.entityInformation.isVersioned() && deleteResult.wasAcknowledged() && deleteResult.getDeletedCount() == 0L) {
            throw new OptimisticLockingFailureException(
                    String.format(
                            "The entity with id %s with version %s in %s cannot be deleted! " +
                                    "Was it modified or deleted in the meantime?",
                    this.entityInformation.getId(entity), this.entityInformation.getVersion(entity),
                            this.entityInformation.getCollectionName()));
        }
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Report> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Report> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Report> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Report> S insert(S entity) {
        Assert.notNull(entity, "Entity must not be null!");
        return this.mongoOperations.insert(entity, this.entityInformation.getCollectionName());
    }

    @Override
    public <S extends Report> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Report> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Report> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Report> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Report> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Report> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Report> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Report, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    private List<Report> findAll(@Nullable Query query) {
        return query == null ? Collections.emptyList() :
                this.mongoOperations.find(query, this.entityInformation.getJavaType(),
                        this.entityInformation.getCollectionName());
    }

    private Query getIdQuery(Object id) {
        return new Query(this.getIdCriteria(id));
    }

    private Criteria getIdCriteria(Object id) {
        return Criteria.where(this.entityInformation.getIdAttribute()).is(id);
    }

    @Override
    public Report update(Report entity) {
        String id = entity.getId();
        Optional<Report> oldReport = findById(id);
        if (oldReport.isPresent()) {
            return this.mongoOperations.save(
                    entity, this.entityInformation.getCollectionName());
        } else {
            return this.save(entity);
        }

    }
}
