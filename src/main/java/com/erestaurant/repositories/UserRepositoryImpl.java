package com.erestaurant.repositories;

import com.erestaurant.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository{

    private JdbcTemplate jdbc;

    @Autowired
    private UserRepositoryImpl(DataSource dataSource){
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public User create(User user) {
        return jdbc.queryForObject("INSERT INTO USERS VALUES(?,?,?) returning *",
                new Object[] {user.getTip(),user.getNrtelefon(),user.getEmail()},
                new UserRowMapper());
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User getByEmail(String email) {
        return jdbc.queryForObject("SELECT * FROM USERS WHERE EMAIL =?",
                new Object[] {email},
                new UserRowMapper());
    }

    class UserRowMapper implements RowMapper<User>{

        @Override
       public User mapRow(ResultSet resultSet,int i)
            throws SQLException{
                    User user = new User();
                    user.setIDu(resultSet.getLong("IDUSER"));
                    user.setTip(resultSet.getInt("TYPE"));
                    user.setNrtelefon(resultSet.getString("PHONE"));
                    user.setEmail(resultSet.getString("EMAIL"));
                    return user;
                 }

             }
}
