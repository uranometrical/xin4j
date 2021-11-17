package dev.tomat.xin4j;

import tomat.dev.xin4j.core.ApiResponse;
import tomat.dev.xin4j.core.XinCraftApi;
import tomat.dev.xin4j.user.UserInfo;

public class PrintWinstreak {
    public static void main(String[] args) {
        XinCraftApi api = new XinCraftApi("key");
        /*ApiResponse<UserInfo> userInfoResponse = api.getUserInfo("uuid or username");

        if (userInfoResponse.Successful) {
            UserInfo userInfo = userInfoResponse.Response;
            System.out.println(userInfo.Statistics.Overall.Winstreak);
        }
        else {
            userInfoResponse.Error.printStackTrace();
        }*/
    }
}
