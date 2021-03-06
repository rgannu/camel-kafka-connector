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
package org.apache.camel.kafkaconnector.hbase;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelHbaseSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_HBASE_PATH_TABLE_NAME_CONF = "camel.sink.path.tableName";
    public static final String CAMEL_SINK_HBASE_PATH_TABLE_NAME_DOC = "The name of the table";
    public static final String CAMEL_SINK_HBASE_PATH_TABLE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_CONF = "camel.sink.endpoint.cellMappingStrategyFactory";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DOC = "To use a custom CellMappingStrategyFactory that is responsible for mapping cells.";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_FILTERS_CONF = "camel.sink.endpoint.filters";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_FILTERS_DOC = "A list of filters to use.";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_FILTERS_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_CONF = "camel.sink.endpoint.mappingStrategyClassName";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DOC = "The class name of a custom mapping strategy implementation.";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_CONF = "camel.sink.endpoint.mappingStrategyName";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DOC = "The strategy to use for mapping Camel messages to HBase columns. Supported values: header, or body. One of: [header] [body]";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_CONF = "camel.sink.endpoint.rowMapping";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_DOC = "To map the key/values from the Map to a HBaseRow. The following keys is supported: rowId - The id of the row. This has limited use as the row usually changes per Exchange. rowType - The type to covert row id to. Supported operations: CamelHBaseScan. family - The column family. Supports a number suffix for referring to more than one columns. qualifier - The column qualifier. Supports a number suffix for referring to more than one columns. value - The value. Supports a number suffix for referring to more than one columns valueType - The value type. Supports a number suffix for referring to more than one columns. Supported operations: CamelHBaseGet, and CamelHBaseScan.";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_CONF = "camel.sink.endpoint.rowModel";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_DOC = "An instance of org.apache.camel.component.hbase.model.HBaseRow which describes how each row should be modeled";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_CONF = "camel.sink.endpoint.userGroupInformation";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DOC = "Defines privileges to communicate with HBase such as using kerberos.";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DEFAULT = null;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_CONF = "camel.sink.endpoint.maxResults";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_DOC = "The maximum number of rows to scan.";
    public static final Integer CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_DEFAULT = 100;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_CONF = "camel.component.hbase.poolMaxSize";
    public static final String CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_DOC = "Maximum number of references to keep for each table in the HTable pool. The default value is 10.";
    public static final Integer CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_DEFAULT = 10;
    public static final String CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.hbase.lazyStartProducer";
    public static final String CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.hbase.basicPropertyBinding";
    public static final String CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_CONF = "camel.component.hbase.configuration";
    public static final String CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelHbaseSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelHbaseSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_HBASE_PATH_TABLE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_PATH_TABLE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_HBASE_PATH_TABLE_NAME_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_CELL_MAPPING_STRATEGY_FACTORY_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_FILTERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_FILTERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_FILTERS_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_CLASS_NAME_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_MAPPING_STRATEGY_NAME_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_ROW_MAPPING_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_ROW_MODEL_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_USER_GROUP_INFORMATION_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_CONF, ConfigDef.Type.INT, CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_MAX_RESULTS_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_COMPONENT_POOL_MAX_SIZE_DOC);
        conf.define(CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_HBASE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_HBASE_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}