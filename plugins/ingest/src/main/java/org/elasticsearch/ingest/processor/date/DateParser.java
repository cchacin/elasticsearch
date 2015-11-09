/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.ingest.processor.date;

import org.joda.time.DateTime;

/**
 * Parser for dates provided as strings. Parses into a joda {@link DateTime} object.
 * We use our own joda wrapper as we support some formats that are not supported directly by joda.
 *
 */
public interface DateParser {

    /**
     * Parser the date provided as a string argument into a joda {@link DateTime} object
     */
    DateTime parseDateTime(String date);
}