package com.ccb.job.admin.core.route.strategy;


import com.ccb.job.admin.core.route.ExecutorRouter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by xuxueli on 17/3/10.
 */
public class ExecutorRouteRandom extends ExecutorRouter {

    private static  Random localRandom = new Random();

    @Override
    public String route(String jobId, ArrayList<String> addressList) {
        // Collections.shuffle(addressList);
        return addressList.get(localRandom.nextInt(addressList.size()));
    }

}
