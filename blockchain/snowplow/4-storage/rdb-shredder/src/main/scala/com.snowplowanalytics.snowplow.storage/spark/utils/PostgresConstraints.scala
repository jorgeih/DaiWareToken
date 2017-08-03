/*
 * Copyright (c) 2012-2017 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 * http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and
 * limitations there under.
 */
package com.snowplowanalytics.snowplow.storage.spark.utils

/** Limits on the size of fields for Postgres "null" indicates a type other than char or varchar */
object PostgresConstraints {
  val maxFieldLengths = List(
    255,
    255,
    null,
    null,
    null,
    128,
    36,
    null,
    128,
    100,
    100,
    100,
    255,
    45,
    50,
    36,
    null,
    38,
    2,
    2,
    75,
    15,
    null,
    null,
    100,
    100,
    100,
    100,
    100,
    null,
    2000,
    null,
    16,
    255,
    null,
    3000,
    6000,
    3000,
    16,
    255,
    null,
    6000,
    6000,
    3000,
    25,
    50,
    255,
    255,
    255,
    255,
    500,
    255,
    null,
    1000,
    1000,
    1000,
    1000,
    null,
    null,
    255,
    255,
    null,
    null,
    null,
    255,
    255,
    255,
    255,
    255,
    255,
    255,
    null,
    null,
    null,
    null,
    null,
    null,
    1000,
    50,
    50,
    50,
    50,
    50,
    255,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    12,
    null,
    null,
    50,
    50,
    50,
    50,
    50,
    null,
    null,
    null,
    128,
    null,
    null,
    3,
    null,
    null,
    null,
    3,
    null,
    3,
    64,
    128,
    64,
    500,
    null,
    36,
    null,
    null,
    36,
    null,
    1000,
    1000,
    128,
    128,
    128,
    null
  ) map {
    case i: Int => Some(i)
    case _ => None
  }
}