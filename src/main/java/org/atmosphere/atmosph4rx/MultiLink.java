/**
 * Copyright 2018 Async-IO.org
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
package org.atmosphere.atmosph4rx;


import org.reactivestreams.Processor;

public interface MultiLink<T extends Processor<? super String, ? super String>, U> {

    String topic();

    MultiLink<T, U> publish(U message);

    T toProcessor();

}