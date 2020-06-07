/*
 * This file is generated by jOOQ.
*/
package c.b.s.common.message.infrastructure.jooq.tables.records;


import c.b.s.common.message.infrastructure.jooq.tables.TbMesageFile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TbMesageFileRecord extends UpdatableRecordImpl<TbMesageFileRecord> implements Record6<Long, Long, String, Timestamp, Timestamp, Byte> {

    private static final long serialVersionUID = -115489195;

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.message_id</code>. 批量下载语音文件id
     */
    public void setMessageId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.message_id</code>. 批量下载语音文件id
     */
    public Long getMessageId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.file_name</code>. 压缩文件名
     */
    public void setFileName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.file_name</code>. 压缩文件名
     */
    public String getFileName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.inserttime</code>. 插入时间
     */
    public void setInserttime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.inserttime</code>. 插入时间
     */
    public Timestamp getInserttime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.updatetime</code>. 更新时间
     */
    public void setUpdatetime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.updatetime</code>. 更新时间
     */
    public Timestamp getUpdatetime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>boxin_saas_tenant.tb_mesage_file.isactive</code>. 生效与否
     */
    public void setIsactive(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>boxin_saas_tenant.tb_mesage_file.isactive</code>. 生效与否
     */
    public Byte getIsactive() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, Timestamp, Timestamp, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, Timestamp, Timestamp, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbMesageFile.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TbMesageFile.MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbMesageFile.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TbMesageFile.INSERTTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TbMesageFile.UPDATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TbMesageFile.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getInserttime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getInserttime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value2(Long value) {
        setMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value3(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value4(Timestamp value) {
        setInserttime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value5(Timestamp value) {
        setUpdatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord value6(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbMesageFileRecord values(Long value1, Long value2, String value3, Timestamp value4, Timestamp value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbMesageFileRecord
     */
    public TbMesageFileRecord() {
        super(TbMesageFile.TB_MESAGE_FILE);
    }

    /**
     * Create a detached, initialised TbMesageFileRecord
     */
    public TbMesageFileRecord(Long id, Long messageId, String fileName, Timestamp inserttime, Timestamp updatetime, Byte isactive) {
        super(TbMesageFile.TB_MESAGE_FILE);

        set(0, id);
        set(1, messageId);
        set(2, fileName);
        set(3, inserttime);
        set(4, updatetime);
        set(5, isactive);
    }
}