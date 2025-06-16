require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "app-software-timer"

IMAGE_NAME[vardepsexclude] += "IMAGE_VERSION"
IMAGE_VERSION ?= "${MACHINE}-${DATETIME}"
IMAGE_NAME = "${IMAGE_BASENAME}-${IMAGE_VERSION}"
