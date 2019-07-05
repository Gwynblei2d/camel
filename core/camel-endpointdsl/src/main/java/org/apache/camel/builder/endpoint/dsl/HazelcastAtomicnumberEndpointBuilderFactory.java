/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The hazelcast-atomicvalue component is used to access Hazelcast atomic
 * number, which is an object that simply provides a grid wide number (long).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastAtomicnumberEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hazelcast Atomic Number component.
     */
    public interface HazelcastAtomicnumberEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastAtomicnumberEndpointBuilder advanced() {
            return (AdvancedHazelcastAtomicnumberEndpointBuilder) this;
        }
        /**
         * The name of the cache.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder cacheName(String cacheName) {
            setProperty("cacheName", cacheName);
            return this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: common
         */
        default HazelcastAtomicnumberEndpointBuilder reliable(boolean reliable) {
            setProperty("reliable", reliable);
            return this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: common
         */
        default HazelcastAtomicnumberEndpointBuilder reliable(String reliable) {
            setProperty("reliable", reliable);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder defaultOperation(
                String defaultOperation) {
            setProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstance(
                Object hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            setProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default HazelcastAtomicnumberEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            setProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder onErrorDelay(
                int onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder onErrorDelay(
                String onErrorDelay) {
            setProperty("onErrorDelay", onErrorDelay);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder pollTimeout(int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder pollTimeout(
                String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder transacted(
                boolean transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder transacted(
                String transacted) {
            setProperty("transacted", transacted);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder transferExchange(
                boolean transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: seda
         */
        default HazelcastAtomicnumberEndpointBuilder transferExchange(
                String transferExchange) {
            setProperty("transferExchange", transferExchange);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast Atomic Number component.
     */
    public interface AdvancedHazelcastAtomicnumberEndpointBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastAtomicnumberEndpointBuilder basic() {
            return (HazelcastAtomicnumberEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedHazelcastAtomicnumberEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
     * enum.
     */
    enum HazelcastOperation {
        put,
        delete,
        get,
        update,
        query,
        getAll,
        clear,
        putIfAbsent,
        allAll,
        removeAll,
        retainAll,
        evict,
        evictAll,
        valueCount,
        containsKey,
        containsValue,
        keySet,
        removevalue,
        increment,
        decrement,
        setvalue,
        destroy,
        compareAndSet,
        getAndAdd,
        add,
        offer,
        peek,
        poll,
        remainingCapacity,
        drainTo,
        removeIf,
        take,
        publish,
        readOnceHeal,
        readOnceTail,
        capacity;
    }
    /**
     * Hazelcast Atomic Number (camel-hazelcast)
     * The hazelcast-atomicvalue component is used to access Hazelcast atomic
     * number, which is an object that simply provides a grid wide number
     * (long).
     * 
     * Syntax: <code>hazelcast-atomicvalue:cacheName</code>
     * Category: cache,datagrid
     * Available as of version: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     */
    default HazelcastAtomicnumberEndpointBuilder hazelcastAtomicnumber(
            String path) {
        class HazelcastAtomicnumberEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastAtomicnumberEndpointBuilder, AdvancedHazelcastAtomicnumberEndpointBuilder {
            public HazelcastAtomicnumberEndpointBuilderImpl(String path) {
                super("hazelcast-atomicvalue", path);
            }
        }
        return new HazelcastAtomicnumberEndpointBuilderImpl(path);
    }
}