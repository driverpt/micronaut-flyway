/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.configuration.dbmigration.flyway.common;

/**
 * A pair of any types.
 *
 * @param <T1> The first type
 * @param <T2> The second type
 *
 * @author Jame Kleeh
 * @since 1.1.0
 */
public class Pair<T1, T2> {

    private final T1 first;
    private final T2 second;

    /**
     * @param first The first parameter
     * @param second The seconf parameter
     */
    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    /**
     * @return The first parameter
     */
    public T1 getFirst() {
        return first;
    }

    /**
     * @return The second parameter
     */
    public T2 getSecond() {
        return second;
    }
}
