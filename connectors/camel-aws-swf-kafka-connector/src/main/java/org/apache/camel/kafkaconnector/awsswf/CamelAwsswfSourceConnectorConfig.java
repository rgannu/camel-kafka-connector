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
package org.apache.camel.kafkaconnector.awsswf;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwsswfSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AWSSWF_PATH_TYPE_CONF = "camel.source.path.type";
    public static final String CAMEL_SOURCE_AWSSWF_PATH_TYPE_DOC = "Activity or workflow One of: [activity] [workflow]";
    public static final String CAMEL_SOURCE_AWSSWF_PATH_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_CONF = "camel.source.endpoint.amazonSWClient";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DOC = "To use the given AmazonSimpleWorkflowClient as client";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_CONF = "camel.source.endpoint.dataConverter";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_DOC = "An instance of com.amazonaws.services.simpleworkflow.flow.DataConverter to use for serializing/deserializing the data.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_CONF = "camel.source.endpoint.domainName";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_DOC = "The workflow domain to use.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_CONF = "camel.source.endpoint.eventName";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_DOC = "The workflow or activity event name to use.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_CONF = "camel.source.endpoint.region";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_DOC = "Amazon AWS Region. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_CONF = "camel.source.endpoint.version";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_DOC = "The workflow or activity event version to use.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_CONF = "camel.source.endpoint.activityList";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_DOC = "The list name to consume activities from.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_CONF = "camel.source.endpoint.activityThreadPoolSize";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_DOC = "Maximum number of threads in work pool for activity.";
    public static final Integer CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_DEFAULT = 100;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_CONF = "camel.source.endpoint.activityTypeExecutionOptions";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DOC = "Activity execution options";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_CONF = "camel.source.endpoint.activityTypeRegistrationOptions";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DOC = "Activity registration options";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_CONF = "camel.source.endpoint.clientConfigurationParameters";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DOC = "To configure the ClientConfiguration using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF = "camel.source.endpoint.startWorkflowOptionsParameters";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC = "To configure the StartWorkflowOptions using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_CONF = "camel.source.endpoint.sWClientParameters";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DOC = "To configure the AmazonSimpleWorkflowClient using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_CONF = "camel.source.endpoint.accessKey";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_CONF = "camel.source.endpoint.secretKey";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_CONF = "camel.source.endpoint.workflowList";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_DOC = "The list name to consume workflows from.";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_CONF = "camel.source.endpoint.workflowTypeRegistrationOptions";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DOC = "Workflow registration options";
    public static final String CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_CONF = "camel.component.aws-swf.amazonSWClient";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DOC = "To use the given AmazonSimpleWorkflowClient as client";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-swf.configuration";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_CONF = "camel.component.aws-swf.dataConverter";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_DOC = "An instance of com.amazonaws.services.simpleworkflow.flow.DataConverter to use for serializing/deserializing the data.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_CONF = "camel.component.aws-swf.domainName";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_DOC = "The workflow domain to use.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_CONF = "camel.component.aws-swf.eventName";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_DOC = "The workflow or activity event name to use.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_CONF = "camel.component.aws-swf.region";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_DOC = "Amazon AWS Region. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_CONF = "camel.component.aws-swf.version";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_DOC = "The workflow or activity event version to use.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.aws-swf.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_CONF = "camel.component.aws-swf.activityList";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_DOC = "The list name to consume activities from.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_CONF = "camel.component.aws-swf.activityThreadPoolSize";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_DOC = "Maximum number of threads in work pool for activity.";
    public static final Integer CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_DEFAULT = 100;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_CONF = "camel.component.aws-swf.activityTypeExecutionOptions";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DOC = "Activity execution options";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_CONF = "camel.component.aws-swf.activityTypeRegistrationOptions";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DOC = "Activity registration options";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.aws-swf.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_CONF = "camel.component.aws-swf.clientConfigurationParameters";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DOC = "To configure the ClientConfiguration using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF = "camel.component.aws-swf.startWorkflowOptionsParameters";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC = "To configure the StartWorkflowOptions using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_CONF = "camel.component.aws-swf.sWClientParameters";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DOC = "To configure the AmazonSimpleWorkflowClient using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-swf.accessKey";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-swf.secretKey";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_CONF = "camel.component.aws-swf.workflowList";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_DOC = "The list name to consume workflows from.";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_CONF = "camel.component.aws-swf.workflowTypeRegistrationOptions";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DOC = "Workflow registration options";
    public static final String CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DEFAULT = null;

    public CamelAwsswfSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwsswfSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AWSSWF_PATH_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_PATH_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSSWF_PATH_TYPE_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_AMAZON_SWCLIENT_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_DATA_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_DOMAIN_NAME_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_EVENT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_VERSION_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_LIST_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_THREAD_POOL_SIZE_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_CLIENT_CONFIGURATION_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_SWCLIENT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_LIST_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_ENDPOINT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_AMAZON_SWCLIENT_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_DATA_CONVERTER_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_DOMAIN_NAME_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_EVENT_NAME_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_VERSION_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_LIST_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_THREAD_POOL_SIZE_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_EXECUTION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_ACTIVITY_TYPE_REGISTRATION_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_AWSSWF_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_CLIENT_CONFIGURATION_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_START_WORKFLOW_OPTIONS_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_SWCLIENT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_LIST_DOC);
        conf.define(CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSSWF_COMPONENT_WORKFLOW_TYPE_REGISTRATION_OPTIONS_DOC);
        return conf;
    }
}