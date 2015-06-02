package com.erestaurant.repositories;

import com.erestaurant.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 */
@Repository
public class MenuRepositoryImpl implements  MenuRepository{

    private JdbcTemplate jdbc;

    @Autowired
    public MenuRepositoryImpl(DataSource dataSource){
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public Menu create(Menu menu) {
        return jdbc.queryForObject("INSERT INTO FOODS VALUES(?,?,?,?) returning *",
                new Object[] {menu.getDenumire(),menu.getPret(),menu.getCantitate(),menu.getTip()},
                new MenuRowMapper());
    }

    @Override
    public Menu update(Menu menu) {
        return null;
    }

    @Override
    public void delete(Menu menu) {

    }

    @Override
    public List<Menu> getMenus() {
        List<Menu> menus = new List<Menu>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Menu> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Menu menu) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Menu> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Menu> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Menu get(int index) {
                return null;
            }

            @Override
            public Menu set(int index, Menu element) {
                return null;
            }

            @Override
            public void add(int index, Menu element) {

            }

            @Override
            public Menu remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Menu> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Menu> listIterator(int index) {
                return null;
            }

            @Override
            public List<Menu> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Menu menu = new Menu();
        String sql="SELECT * FROM FOODS";
        jdbc.query(sql, (ResultSetExtractor<Object>) menus);
        return menus;
    }

    @Override
    public Menu getID(long ID) {
        return jdbc.queryForObject("SELECT * FROM FOODS WHERE ID =?",
            new Object[] {ID},
        new MenuRowMapper());
    }

    class MenuRowMapper implements RowMapper<Menu> {

        @Override
        public Menu mapRow(ResultSet resultSet,int i)
                throws SQLException {
            Menu menu = new Menu();
            menu.setIDm(resultSet.getLong("IDFOOD"));
            menu.setDenumire(resultSet.getString("NAME"));
            menu.setPret(resultSet.getInt("PRICE"));
            menu.setCantitate(resultSet.getInt("QUANTITY"));
            menu.setTip(resultSet.getString("TYPE"));
            return menu;
        }

    }
}
