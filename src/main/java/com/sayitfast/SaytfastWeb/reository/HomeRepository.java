package com.sayitfast.SaytfastWeb.reository;

import com.sayitfast.SaytfastWeb.model.UpdatesPage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA. User: Rhett Herring 9/14/20 11:17 PM
 */
public interface HomeRepository extends JpaRepository<UpdatesPage, Long> {

}
