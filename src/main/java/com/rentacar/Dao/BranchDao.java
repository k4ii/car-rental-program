package com.rentacar.Dao;

import com.rentacar.Model.Branch;

public interface BranchDao {

    void addBranch(Branch branch);

    Branch getBranch(int id);

    void updateBranch(int id);

    void deleteBranch(int id);
}
