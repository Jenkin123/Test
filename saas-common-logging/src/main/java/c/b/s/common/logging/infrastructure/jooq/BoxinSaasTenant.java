/*
 * This file is generated by jOOQ.
*/
package c.b.s.common.logging.infrastructure.jooq;


import c.b.s.common.logging.infrastructure.jooq.tables.CasLoginLog;
import c.b.s.common.logging.infrastructure.jooq.tables.CasOperationLog;
import c.b.s.common.logging.infrastructure.jooq.tables.TbImportRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BoxinSaasTenant extends SchemaImpl {

    private static final long serialVersionUID = 159939680;

    /**
     * The reference instance of <code>boxin_saas_tenant</code>
     */
    public static final BoxinSaasTenant BOXIN_SAAS_TENANT = new BoxinSaasTenant();

    /**
     * 智牛SaaS平台登录日志表, owner: guiqingqing, manager: zhengkeshuang
     */
    public final CasLoginLog CAS_LOGIN_LOG = c.b.s.common.logging.infrastructure.jooq.tables.CasLoginLog.CAS_LOGIN_LOG;

    /**
     * 智牛SaaS平台操作日志表, owner: guiqingqing, manager: zhengkeshuang
     */
    public final CasOperationLog CAS_OPERATION_LOG = c.b.s.common.logging.infrastructure.jooq.tables.CasOperationLog.CAS_OPERATION_LOG;

    /**
     * 催收作业系统导入记录表, owner: guiqingqing, manager: zhengkeshuang
     */
    public final TbImportRecord TB_IMPORT_RECORD = c.b.s.common.logging.infrastructure.jooq.tables.TbImportRecord.TB_IMPORT_RECORD;

    /**
     * No further instances allowed
     */
    private BoxinSaasTenant() {
        super("boxin_saas_tenant", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CasLoginLog.CAS_LOGIN_LOG,
            CasOperationLog.CAS_OPERATION_LOG,
            TbImportRecord.TB_IMPORT_RECORD);
    }
}
