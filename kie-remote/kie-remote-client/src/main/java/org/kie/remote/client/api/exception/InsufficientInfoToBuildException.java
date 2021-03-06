/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
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

package org.kie.remote.client.api.exception;

import org.kie.remote.client.api.RemoteRuntimeEngineBuilder;
import org.kie.remote.client.internal.command.RemoteClientException;

/**
 * This exception is thrown by the *RuntimeFactoryBuilder classes
 * when insufficient information is called during
 * {@link RemoteRuntimeEngineBuilder#buildFactory()} and similar methods.
 * </p>
 * It indicates that the builder can not create an instance because
 * there is insufficient information.
 */
public class InsufficientInfoToBuildException extends RemoteClientException {

    /** generated serial version UID */
    private static final long serialVersionUID = 7415935205523780077L;

    public InsufficientInfoToBuildException(String msg) {
        super(msg);
    }
}
