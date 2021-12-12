package com.example.ePHI.repositories;

import com.example.ePHI.model.OperationDates;
import mongoHelpers.MongoHelper;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class OperationDatesRepositoryImpl implements OperationDatesRepository {
    private static final String OPERATION_DATES_PREFIX = "OPERATION_DATES_";
    private final MongoOperations mongoOperations;
    private final MongoEntityInformation<OperationDates, String> entityInformation;

    public OperationDatesRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
        this.entityInformation = MongoHelper.getEntityInformationFor(OperationDates.class, String.class);
    }

    @Override
    public <S extends OperationDates> S save(S entity) {
        entity.setId(OPERATION_DATES_PREFIX + UUID.randomUUID());
        return  this.mongoOperations.insert(
                entity,
                this.entityInformation.getCollectionName());
    }

    @Override
    public <S extends OperationDates> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<OperationDates> findById(String id) {
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
    public List<OperationDates> findAll() {
        return this.findAll(new Query());
    }

    @Override
    public Iterable<OperationDates> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String id) {
        Assert.notNull(id, "The given id must not be null!");
        this.mongoOperations.remove(this.getIdQuery(id), this.entityInformation.getJavaType(),
                this.entityInformation.getCollectionName());
    }

    @Override
    public void delete(OperationDates entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends OperationDates> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<OperationDates> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<OperationDates> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OperationDates> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends OperationDates> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends OperationDates> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends OperationDates> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends OperationDates> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends OperationDates> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OperationDates> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends OperationDates> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends OperationDates, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    private List<OperationDates> findAll(@Nullable Query query) {
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
    public OperationDates update(OperationDates entity) {
        String id = entity.getId();
        Optional<OperationDates> oldReport = findById(id);
        if (oldReport.isPresent()) {
            return this.mongoOperations.save(
                    entity, this.entityInformation.getCollectionName());
        } else {
            return this.save(entity);
        }

    }
}
