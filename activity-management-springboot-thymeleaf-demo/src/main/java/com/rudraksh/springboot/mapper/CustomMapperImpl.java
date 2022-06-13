package com.rudraksh.springboot.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rudraksh.springboot.web.dto.ActivityWithUser;
import com.rudraksh.springboot.web.dto.IActivityWithUser;

@Component
public class CustomMapperImpl implements CustomMapper {

	@Override
    public List<ActivityWithUser> iActivityWithUsertoActivityWithUser(List<IActivityWithUser> l) {
        if ( l == null ) {
            return null;
        }

        List<ActivityWithUser> list = new ArrayList<ActivityWithUser>( l.size() );
        for ( IActivityWithUser iActivityWithUser : l ) {
            list.add( iActivityWithUserToActivityWithUser( iActivityWithUser ) );
        }

        return list;
    }

    protected ActivityWithUser iActivityWithUserToActivityWithUser(IActivityWithUser iActivityWithUser) {
        if ( iActivityWithUser == null ) {
            return null;
        }

        ActivityWithUser activityWithUser = new ActivityWithUser();

        activityWithUser.setFirstName( iActivityWithUser.getFirstName() );
        activityWithUser.setLastName( iActivityWithUser.getLastName() );
        activityWithUser.setActivityName( iActivityWithUser.getActivityName() );
        activityWithUser.setActivityDesc( iActivityWithUser.getActivityDesc() );
        activityWithUser.setDeadlineDate( iActivityWithUser.getDeadlineDate() );

        return activityWithUser;
    }

}
