package example.com.nfcendpoint;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Abhishek Jain on 6/12/2017.
 */

public interface KioskService {
    @POST("/TestPartnerApi/patient/SendPatientId/{data}")
    Call<Void> postNfcData(@Path("data") int data);
}
