/**
 * Copyright 2018-2019 Async-IO.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.atmosphere.atmosph4rx.core;

import org.atmosphere.atmosph4rx.AxSocket;
import org.atmosphere.atmosph4rx.AxSockets;
import reactor.core.publisher.FluxProcessor;

public interface AxSocketsProcessor<IN extends String> extends AxSockets<FluxProcessor<? super String, ? super String>, String> {

    @Override
    FluxProcessor<String,String> toProcessor();

    default void subscribe(AxSocket<FluxProcessor<? super String, ? super String>, IN> single){
        toProcessor().subscribe(single.toProcessor());
    }
}
