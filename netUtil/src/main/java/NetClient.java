import okhttp3.*;
import okhttp3.Request.Builder;

import java.io.IOException;
import java.util.Map;

public class NetClient {
    public static String Post (Map<String, String> params, String url) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        FormBody.Builder builder = new FormBody.Builder();
        for (String key : params.values()) {
            builder.add(key, params.get(key));
        }

        RequestBody body = builder.build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Call call = okHttpClient.newCall(request);
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response == null ? null : response.body().string();
    }

    public static String Get (String url) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url).build();

        Call call = okHttpClient.newCall(request);
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response == null ? null : response.body().string();
    }

    public static String GetUserByNfc (String nfc) throws IOException {
        String url = "http://127.0.0.1:8099/getUserById" + "/" + nfc;
        return Get(url);
    }
}