/**
 * Copyright 2009-2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Wraps a database connection.
 * Handles the connection lifecycle that comprises: its creation, preparation, commit/rollback and close.
 *
 * 包装数据库连接。处理连接生命周期，包括：连接的创建、准备、提交回滚和关闭
 *
 * @author Clinton Begin
 */
public interface Transaction {
    // 获取该事务关联的数据库连接对象
    Connection getConnection() throws SQLException;

    // 提交当前事务
    void commit() throws SQLException;

    // 回滚当前事务
    void rollback() throws SQLException;

    // 关闭当前事务关联的底层数据库连接
    void close() throws SQLException;

    // 获取当前事务超时时间
    Integer getTimeout() throws SQLException;
}
