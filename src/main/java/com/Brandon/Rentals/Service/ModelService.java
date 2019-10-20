package com.Brandon.Rentals.Service;
import com.Brandon.Rentals.Domain.Models;

import java.util.Set;

public interface ModelService extends IService<Models,String> {

    Set<Models> getAll();

}
