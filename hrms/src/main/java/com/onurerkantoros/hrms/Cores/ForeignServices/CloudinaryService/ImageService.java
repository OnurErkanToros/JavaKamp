package com.onurerkantoros.hrms.Cores.ForeignServices.CloudinaryService;

import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface ImageService {
    DataResult<Map<String,String>> uploadImageFile(MultipartFile imageFile);
}
