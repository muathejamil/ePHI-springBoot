package com.example.ePHI.repositories;

import com.example.ePHI.model.Insurance;
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

public class InsuranceRepositoryImpl implements InsuranceRepository {

    private static final String INSURANCE_PREFIX = "INSURANCE_";
    private final MongoOperations mongoOperations;
    private final MongoEntityInformation<Insurance, String> entityInformation;

    public InsuranceRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
        this.entityInformation = MongoHelper.getEntityInformationFor(Insurance.class, String.class);
    }

    @Override
    public <S extends Insurance> S save(S entity) {
        entity.setId(INSURANCE_PREFIX + UUID.randomUUID());
        return  this.mongoOperations.insert(
                entity,
                this.entityInformation.getCollectionName());
    }

    @Override
    public <S extends Insurance> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Insurance> findById(String id) {
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
    public List<Insurance> findAll() {
        return this.findAll(new Query());
    }

    @Override
    public Iterable<Insurance> findAllById(Iterable<String> strings) {
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
    public void delete(Insurance entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Insurance> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Insurance> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Insurance> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Insurance> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Insurance> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Insurance> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Insurance> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Insurance> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Insurance> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Insurance> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Insurance> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Insurance, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    private List<Insurance> findAll(@Nullable Query query) {
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
    public Insurance update(Insurance entity) {
        String id = entity.getId();
        Optional<Insurance> oldEntity = findById(id);
        if (oldEntity.isPresent()) {
            return this.mongoOperations.save(
                    entity, this.entityInformation.getCollectionName());
        } else {
            return this.save(entity);
        }

    }
}
