package com.Brandon.Rentals.Repository;


import com.Brandon.Rentals.Domain.Models;

import java.util.Set;

public interface ModelsRepository extends IRepository<Models, String> {

    Set<Models> getAll();

}
