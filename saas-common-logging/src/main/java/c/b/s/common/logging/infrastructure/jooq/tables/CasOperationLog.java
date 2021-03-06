/*
 * This file is generated by jOOQ.
*/
package c.b.s.common.logging.infrastructure.jooq.tables;


import c.b.s.common.logging.infrastructure.jooq.BoxinSaasTenant;
import c.b.s.common.logging.infrastructure.jooq.Keys;
import c.b.s.common.logging.infrastructure.jooq.tables.records.CasOperationLogRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 智牛SaaS平台操作日志表, owner: guiqingqing, manager: zhengkeshuang
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CasOperationLog extends TableImpl<CasOperationLogRecord> {

    private static final long serialVersionUID = -1312388766;

    /**
     * The reference instance of <code>boxin_saas_tenant.cas_operation_log</code>
     */
    public static final CasOperationLog CAS_OPERATION_LOG = new CasOperationLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CasOperationLogRecord> getRecordType() {
        return CasOperationLogRecord.class;
    }

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.id</code>. 主键ID
     */
    public static final TableField<CasOperationLogRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), CAS_OPERATION_LOG, "主键ID");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.user_id</code>. 用户ID
     */
    public static final TableField<CasOperationLogRecord, ULong> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), CAS_OPERATION_LOG, "用户ID");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.user_name</code>. 用户名
     */
    public static final TableField<CasOperationLogRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "用户名");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.real_name</code>. 用户姓名
     */
    public static final TableField<CasOperationLogRecord, String> REAL_NAME = createField("real_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "用户姓名");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.application_id</code>. 应用ID
     */
    public static final TableField<CasOperationLogRecord, ULong> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), CAS_OPERATION_LOG, "应用ID");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.ip</code>. IP地址
     */
    public static final TableField<CasOperationLogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "IP地址");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.url</code>. URL
     */
    public static final TableField<CasOperationLogRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "URL");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.operation_code</code>. 操作码
     */
    public static final TableField<CasOperationLogRecord, String> OPERATION_CODE = createField("operation_code", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "操作码");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.operation_value</code>. 操作值
     */
    public static final TableField<CasOperationLogRecord, String> OPERATION_VALUE = createField("operation_value", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), CAS_OPERATION_LOG, "操作值");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.inserttime</code>. 创建时间
     */
    public static final TableField<CasOperationLogRecord, Timestamp> INSERTTIME = createField("inserttime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), CAS_OPERATION_LOG, "创建时间");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.updatetime</code>. 更新时间
     */
    public static final TableField<CasOperationLogRecord, Timestamp> UPDATETIME = createField("updatetime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), CAS_OPERATION_LOG, "更新时间");

    /**
     * The column <code>boxin_saas_tenant.cas_operation_log.isactive</code>. 逻辑删除
     */
    public static final TableField<CasOperationLogRecord, Byte> ISACTIVE = createField("isactive", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), CAS_OPERATION_LOG, "逻辑删除");

    /**
     * No further instances allowed
     */
    private CasOperationLog() {
        this(DSL.name("cas_operation_log"), null);
    }

    private CasOperationLog(Name alias, Table<CasOperationLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CasOperationLog(Name alias, Table<CasOperationLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "智牛SaaS平台操作日志表, owner: guiqingqing, manager: zhengkeshuang");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return BoxinSaasTenant.BOXIN_SAAS_TENANT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CasOperationLogRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CAS_OPERATION_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CasOperationLogRecord> getPrimaryKey() {
        return Keys.KEY_CAS_OPERATION_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CasOperationLogRecord>> getKeys() {
        return Arrays.<UniqueKey<CasOperationLogRecord>>asList(Keys.KEY_CAS_OPERATION_LOG_PRIMARY);
    }
}
