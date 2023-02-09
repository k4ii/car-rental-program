package com.rentacar.Dao;

import com.rentacar.Model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcBranchDao implements BranchDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcBranchDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addBranch(Branch branch) {

    }

    @Override
    public Branch getBranch(int id) {
        return null;
    }

    @Override
    public void updateBranch(int id) {

    }

    @Override
    public void deleteBranch(int id) {

    }
}
