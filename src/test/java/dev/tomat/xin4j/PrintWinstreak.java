package dev.tomat.xin4j;

import tomat.dev.xin4j.core.ApiResponse;
import tomat.dev.xin4j.core.XinCraftApi;
import tomat.dev.xin4j.endpoints.player.UserInfo;

import java.util.concurrent.ExecutionException;

public class PrintWinstreak {
    public static void main(String[] args) {
        XinCraftApi api = new XinCraftApi("secret key");
        while (true)
        {
            try {
                ApiResponse<UserInfo> userInfoResponse = api.getUserInfoFromUsername("metacinnabar").get();
                if (userInfoResponse.success) {
                    UserInfo userInfo = userInfoResponse.data;
                    System.out.println("metacinnabar's current title: " + userInfo.Title);
                }
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
