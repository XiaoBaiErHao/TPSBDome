LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

# OpenCV
OPENCV_CAMERA_MODULES:=on
OPENCV_INSTALL_MODULES:=on
include D:\AndroidGit\AndroidDomeFour\TPSBDome/OpencvNative/jni/OpenCV.mk

FILE_LIST := $(wildcard $(LOCAL_PATH)/easyPR/src/*/*.cpp)
LOCAL_SRC_FILES := EasyPR.cpp
LOCAL_SRC_FILES += $(FILE_LIST:$(LOCAL_PATH)/%=%)

LOCAL_C_INCLUDES += $(LOCAL_PATH)/
LOCAL_C_INCLUDES += $(LOCAL_PATH)/easyPR/include
LOCAL_MODULE     := EasyPR
LOCAL_LDLIBS += -llog 
include $(BUILD_SHARED_LIBRARY)  

