package com.softtoken.serviceImpl;

import com.softtoken.model.SoftTokenRequest;
import com.softtoken.model.SoftTokenResponse;
import com.softtoken.service.SoftTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@Primary
public class SoftTokenServiceImpl implements SoftTokenService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public SoftTokenResponse save(SoftTokenRequest request) {
        SoftTokenResponse outModel = new SoftTokenResponse();
        Connection oConn = null;
        CallableStatement oStmt = null;

        try {
            oConn = jdbcTemplate.getDataSource().getConnection();

                oStmt = oConn.prepareCall("{CALL mybank.dpr_soft_token_gen (?,?,?,?,?,?,?,?,?)}");


            oStmt.setString(1,request.getUserId());
            oStmt.setString(2,request.getEmail());
            oStmt.setString(3, request.getTokenType());

            oStmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            oStmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            oStmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            oStmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            oStmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            oStmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            oStmt.execute();
            outModel.setSoftToken(oStmt.getString(4));
            outModel.setName(oStmt.getString(5));
            outModel.setEmail(oStmt.getString(6));
            outModel.setQr(oStmt.getString(7));
            outModel.setOutCode(String.valueOf(oStmt.getInt(8)));
            outModel.setOutMessage(oStmt.getString(9));

        } catch (Exception ex) {
            ex.printStackTrace();
            outModel.setOutCode("1");
            outModel.setOutMessage(ex.getMessage());

        } finally {
            if (oConn != null) {
                try {
                    oConn.close();
                    oStmt.close();
                } catch (SQLException e) {
                   e.printStackTrace();
                }

            }
        }
        return outModel;
    }
}
