/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.remote.services.ws.sei.task;

import javax.xml.bind.annotation.XmlType;

/**
 * Only used for initial WSDL generation
 */
@XmlType
public enum ModifyTaskOperationType {

    CHANGE_PRIORITY,
    ADD_TASK_NAMES,
    REPLACE_TASK_NAMES,
    SET_EXPIRATION_DATE,
    ADD_DESCRIPTIONS,
    REPLACE_DESCRIPTIONS,
    SET_SUB_TASK_STRATEGY,
    ;
}
