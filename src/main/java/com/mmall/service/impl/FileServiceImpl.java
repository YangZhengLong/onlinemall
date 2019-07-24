package com.mmall.service.impl;

import com.google.common.collect.Lists;
import com.mmall.service.IFileService;
import com.mmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName FileServiceImpl
 * @Description FileService Implementation
 * @Author Yang Zhenglong
 * @Date 2019/7/24 13:39
 * @Vesion 1.0
 */

@Service("iFileService")
public class FileServiceImpl implements IFileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    public String upload(MultipartFile file,String path){
        String fileName = file.getOriginalFilename();
        //扩展名abc.jpg -> jpg
        String fileEntensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        String uploadFileName = UUID.randomUUID().toString() + "." + fileEntensionName;
        logger.info("开始上传文件，上传文件的文件名:{}，上传的路径:{},新文件名{}",fileName,path,uploadFileName);

        File fileDir = new File(path);
        if(fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }else{
            fileDir.mkdirs();
        }
        File targetFile = new File(fileDir,uploadFileName);

        try {
            file.transferTo(targetFile);
            //文件已经长传成功

            //targetFile上传到ftp服务器上
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
            //已经长传到FTP服务器

            //上传完之后，删除upload下面的文件
//            targetFile.delete();

        } catch (IOException e) {
            logger.error("上传文件异常",e);
            return null;
        }
        return targetFile.getName();
    }
}
