package br.com.strn.ec.database.connection.hibernate.type;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.EnhancedUserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.UUID;

public class UUIDUserType implements EnhancedUserType, Serializable {

    public UUIDUserType() {
    }

    @Override
    public String objectToSQLString(Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public String toXMLString(Object value) {
        return value.toString();
    }

    @Override
    @Deprecated
    public Object fromXMLString(String xmlValue) {
        return UUID.fromString(xmlValue);
    }

    @Override
    public int[] sqlTypes() {
        return new int[]{Types.OTHER};
    }

    @Override
    public Class returnedClass() {
        return UUID.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        return x == null && y == null || !(x == null || y == null) && x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
        String textForm = rs.getString(names[0]);
        if (textForm == null) return null;
        else return UUID.fromString(textForm);
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
        if (value == null) {
            st.setNull(index, Types.OTHER);
        } else {
            st.setObject(index, (UUID) value);
        }
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return ((UUID) value).toString();
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return UUID.fromString((String) cached);
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }
}
