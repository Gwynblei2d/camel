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

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface QuartzEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Quartz2 component.
     */
    public interface QuartzEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedQuartzEndpointBuilder advanced() {
            return (AdvancedQuartzEndpointBuilder) this;
        }
        /**
         * The quartz group name to use. The combination of group name and timer
         * name should be unique.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder groupName(String groupName) {
            setProperty("groupName", groupName);
            return this;
        }
        /**
         * The quartz timer name to use. The combination of group name and timer
         * name should be unique.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder triggerName(String triggerName) {
            setProperty("triggerName", triggerName);
            return this;
        }
        /**
         * Specifies a cron expression to define when to trigger.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder cron(String cron) {
            setProperty("cron", cron);
            return this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder deleteJob(boolean deleteJob) {
            setProperty("deleteJob", deleteJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically delete when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder deleteJob(String deleteJob) {
            setProperty("deleteJob", deleteJob);
            return this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder durableJob(boolean durableJob) {
            setProperty("durableJob", durableJob);
            return this;
        }
        /**
         * Whether or not the job should remain stored after it is orphaned (no
         * triggers point to it).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder durableJob(String durableJob) {
            setProperty("durableJob", durableJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder pauseJob(boolean pauseJob) {
            setProperty("pauseJob", pauseJob);
            return this;
        }
        /**
         * If set to true, then the trigger automatically pauses when route
         * stop. Else if set to false, it will remain in scheduler. When set to
         * false, it will also mean user may reuse pre-configured trigger with
         * camel Uri. Just ensure the names match. Notice you cannot have both
         * deleteJob and pauseJob set to true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder pauseJob(String pauseJob) {
            setProperty("pauseJob", pauseJob);
            return this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder recoverableJob(boolean recoverableJob) {
            setProperty("recoverableJob", recoverableJob);
            return this;
        }
        /**
         * Instructs the scheduler whether or not the job should be re-executed
         * if a 'recovery' or 'fail-over' situation is encountered.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder recoverableJob(String recoverableJob) {
            setProperty("recoverableJob", recoverableJob);
            return this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder stateful(boolean stateful) {
            setProperty("stateful", stateful);
            return this;
        }
        /**
         * Uses a Quartz PersistJobDataAfterExecution and
         * DisallowConcurrentExecution instead of the default job.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default QuartzEndpointBuilder stateful(String stateful) {
            setProperty("stateful", stateful);
            return this;
        }
        /**
         * Whether or not the scheduler should be auto started.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder autoStartScheduler(
                boolean autoStartScheduler) {
            setProperty("autoStartScheduler", autoStartScheduler);
            return this;
        }
        /**
         * Whether or not the scheduler should be auto started.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder autoStartScheduler(
                String autoStartScheduler) {
            setProperty("autoStartScheduler", autoStartScheduler);
            return this;
        }
        /**
         * If it is true will fire the trigger when the route is start when
         * using SimpleTrigger.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder fireNow(boolean fireNow) {
            setProperty("fireNow", fireNow);
            return this;
        }
        /**
         * If it is true will fire the trigger when the route is start when
         * using SimpleTrigger.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder fireNow(String fireNow) {
            setProperty("fireNow", fireNow);
            return this;
        }
        /**
         * Seconds to wait before starting the quartz scheduler.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder startDelayedSeconds(
                int startDelayedSeconds) {
            setProperty("startDelayedSeconds", startDelayedSeconds);
            return this;
        }
        /**
         * Seconds to wait before starting the quartz scheduler.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder startDelayedSeconds(
                String startDelayedSeconds) {
            setProperty("startDelayedSeconds", startDelayedSeconds);
            return this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder triggerStartDelay(long triggerStartDelay) {
            setProperty("triggerStartDelay", triggerStartDelay);
            return this;
        }
        /**
         * In case of scheduler has already started, we want the trigger start
         * slightly after current time to ensure endpoint is fully started
         * before the job kicks in.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: scheduler
         */
        default QuartzEndpointBuilder triggerStartDelay(String triggerStartDelay) {
            setProperty("triggerStartDelay", triggerStartDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Quartz2 component.
     */
    public interface AdvancedQuartzEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default QuartzEndpointBuilder basic() {
            return (QuartzEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder basicPropertyBinding(
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
        default AdvancedQuartzEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Specifies a custom calendar to avoid specific range of date.
         * 
         * The option is a: <code>org.quartz.Calendar</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder customCalendar(
                Object customCalendar) {
            setProperty("customCalendar", customCalendar);
            return this;
        }
        /**
         * Specifies a custom calendar to avoid specific range of date.
         * 
         * The option will be converted to a <code>org.quartz.Calendar</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder customCalendar(
                String customCalendar) {
            setProperty("customCalendar", customCalendar);
            return this;
        }
        /**
         * To configure additional options on the job.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder jobParameters(
                Map<String, Object> jobParameters) {
            setProperty("jobParameters", jobParameters);
            return this;
        }
        /**
         * To configure additional options on the job.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder jobParameters(String jobParameters) {
            setProperty("jobParameters", jobParameters);
            return this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder prefixJobNameWithEndpointId(
                boolean prefixJobNameWithEndpointId) {
            setProperty("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
            return this;
        }
        /**
         * Whether the job name should be prefixed with endpoint id.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder prefixJobNameWithEndpointId(
                String prefixJobNameWithEndpointId) {
            setProperty("prefixJobNameWithEndpointId", prefixJobNameWithEndpointId);
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
        default AdvancedQuartzEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedQuartzEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * To configure additional options on the trigger.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder triggerParameters(
                Map<String, Object> triggerParameters) {
            setProperty("triggerParameters", triggerParameters);
            return this;
        }
        /**
         * To configure additional options on the trigger.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder triggerParameters(
                String triggerParameters) {
            setProperty("triggerParameters", triggerParameters);
            return this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder usingFixedCamelContextName(
                boolean usingFixedCamelContextName) {
            setProperty("usingFixedCamelContextName", usingFixedCamelContextName);
            return this;
        }
        /**
         * If it is true, JobDataMap uses the CamelContext name directly to
         * reference the CamelContext, if it is false, JobDataMap uses use the
         * CamelContext management name which could be changed during the deploy
         * time.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedQuartzEndpointBuilder usingFixedCamelContextName(
                String usingFixedCamelContextName) {
            setProperty("usingFixedCamelContextName", usingFixedCamelContextName);
            return this;
        }
    }
    /**
     * Quartz2 (camel-quartz2)
     * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
     * 
     * Syntax: <code>quartz2:groupName/triggerName</code>
     * Category: scheduling
     * Available as of version: 2.12
     * Maven coordinates: org.apache.camel:camel-quartz2
     */
    default QuartzEndpointBuilder quartz(String path) {
        class QuartzEndpointBuilderImpl extends AbstractEndpointBuilder implements QuartzEndpointBuilder, AdvancedQuartzEndpointBuilder {
            public QuartzEndpointBuilderImpl(String path) {
                super("quartz2", path);
            }
        }
        return new QuartzEndpointBuilderImpl(path);
    }
}