require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "software-timer"

TOOLCHAIN_HOST_TASK:append = " nativesdk-software-timer"