package com.rentacar.Dao;

import com.rentacar.Model.Branch;
import org.springframework.stereotype.Component;

@Component
public class JdbcBranchDao implements BranchDao{
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
