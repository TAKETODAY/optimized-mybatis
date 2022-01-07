/*
 *    Copyright 2021-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.keycolumn;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface InsertMapper {

    @Insert({
        "insert into mbtest.test_identity",
        "(first_name, last_name)",
        "values(#{firstName,jdbcType=VARCHAR}, #{lastName,jdbcType=VARCHAR})"
    })
    @Options(keyProperty="id", useGeneratedKeys=true, keyColumn="name_id")
    int insertNameAnnotated(Name name);

  int insertNameMapped(Name name);
}
