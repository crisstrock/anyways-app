/**
 * CustomerRepository.java
 * Fecha de creación: Jan 17, 2023, 8:12:29 PM
 */
package com.mexcrisoft.anyways.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.mexcrisoft.anyways.model.Customer;

/**
 * Repositorio de clientes
 * @author Cristian E. Ruiz Aguilar(cristianruiz1195@gmail.com)
 * @version 1.0
 * @since anyways 0.0.1-SNAPSHOT
 */
@Repository
public class CustomerRepository implements JpaRepository<Customer, Serializable> {

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.ListCrudRepository#saveAll(java.lang.
     * Iterable)
     */
    @Override
    public <S extends Customer> List<S> saveAll(Iterable<S> entities) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.ListCrudRepository#findAll()
     */
    @Override
    public List<Customer> findAll() {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.ListCrudRepository#findAllById(java.lang.
     * Iterable)
     */
    @Override
    public List<Customer> findAllById(Iterable<Serializable> ids) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    @Override
    public <S extends Customer> S save(S entity) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.CrudRepository#findById(java.lang.Object)
     */
    @Override
    public Optional<Customer> findById(Serializable id) {
        return Optional.empty();
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#existsById(java.lang.
     * Object)
     */
    @Override
    public boolean existsById(Serializable id) {
        return false;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#count()
     */
    @Override
    public long count() {
        return 0;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#deleteById(java.lang.
     * Object)
     */
    @Override
    public void deleteById(Serializable id) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(Customer entity) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.CrudRepository#deleteAllById(java.lang.
     * Iterable)
     */
    @Override
    public void deleteAllById(Iterable<? extends Serializable> ids) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#deleteAll(java.lang.
     * Iterable)
     */
    @Override
    public void deleteAll(Iterable<? extends Customer> entities) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#deleteAll()
     */
    @Override
    public void deleteAll() {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.ListPagingAndSortingRepository#findAll(
     * org.springframework.data.domain.Sort)
     */
    @Override
    public List<Customer> findAll(Sort sort) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.PagingAndSortingRepository#findAll(org.
     * springframework.data.domain.Pageable)
     */
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.query.QueryByExampleExecutor#findOne(org.
     * springframework.data.domain.Example)
     */
    @Override
    public <S extends Customer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.query.QueryByExampleExecutor#findAll(org.
     * springframework.data.domain.Example,
     * org.springframework.data.domain.Pageable)
     */
    @Override
    public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.query.QueryByExampleExecutor#count(org.
     * springframework.data.domain.Example)
     */
    @Override
    public <S extends Customer> long count(Example<S> example) {
        return 0;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.query.QueryByExampleExecutor#exists(org.
     * springframework.data.domain.Example)
     */
    @Override
    public <S extends Customer> boolean exists(Example<S> example) {
        return false;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.repository.query.QueryByExampleExecutor#findBy(org.
     * springframework.data.domain.Example, java.util.function.Function)
     */
    @Override
    public <S extends Customer, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#flush()
     */
    @Override
    public void flush() {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.jpa.repository.JpaRepository#saveAndFlush(java.lang.
     * Object)
     */
    @Override
    public <S extends Customer> S saveAndFlush(S entity) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.jpa.repository.JpaRepository#saveAllAndFlush(java.
     * lang.Iterable)
     */
    @Override
    public <S extends Customer> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.jpa.repository.JpaRepository#deleteAllInBatch(java.
     * lang.Iterable)
     */
    @Override
    public void deleteAllInBatch(Iterable<Customer> entities) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.jpa.repository.JpaRepository#deleteAllByIdInBatch(
     * java.lang.Iterable)
     */
    @Override
    public void deleteAllByIdInBatch(Iterable<Serializable> ids) {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#deleteAllInBatch()
     */
    @Override
    public void deleteAllInBatch() {
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#getOne(java.lang.
     * Object)
     */
    @Override
    public Customer getOne(Serializable id) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#getById(java.lang.
     * Object)
     */
    @Override
    public Customer getById(Serializable id) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see
     * org.springframework.data.jpa.repository.JpaRepository#getReferenceById(java.
     * lang.Object)
     */
    @Override
    public Customer getReferenceById(Serializable id) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#findAll(org.
     * springframework.data.domain.Example)
     */
    @Override
    public <S extends Customer> List<S> findAll(Example<S> example) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

    /*
     * La documentación de este método se encuentra en la clase o interface que lo
     * declara (non-Javadoc)
     *
     * @see org.springframework.data.jpa.repository.JpaRepository#findAll(org.
     * springframework.data.domain.Example, org.springframework.data.domain.Sort)
     */
    @Override
    public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
        // TODO [codificar el cuerpo del método]
    }

}
