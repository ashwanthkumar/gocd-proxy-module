/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.database;

import in.ashwanthkumar.gocd.proxy.module.Copied;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

@Copied
public interface Database {
    String dialectForHibernate();

    String getType();

    void startDatabase();

    DataSource createDataSource();

    void upgrade() throws SQLException;

    void shutdown() throws SQLException;

    void backup(File file);

    String getIbatisConfigXmlLocation();

    QueryExtensions getQueryExtensions();
}
