package com.onurerkantoros.hrms.Cores.ForeignServices.CloudinaryService;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.onurerkantoros.hrms.Cores.Utilities.Result.DataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.ErrorDataResult;
import com.onurerkantoros.hrms.Cores.Utilities.Result.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CloudinaryAdapter implements ImageService {
    @Autowired
    private Cloudinary cloudinary;


    @Override
    public DataResult<Map<String,String>> uploadImageFile(MultipartFile imageFile) {
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
            return new SuccessDataResult<Map<String,String>>(resultMap);
        } catch (IOException e) {
            e.printStackTrace();

        }
        return new ErrorDataResult<Map<String,String>>();
    }
}
