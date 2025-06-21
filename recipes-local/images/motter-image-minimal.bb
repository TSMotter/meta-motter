require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "app-software-timer"

# Tasks are evaluated twice, the first time by the cooker, and the second time by bitbake worker. 
# The task hash is calculated twice and if it will not match, meta is considered unstable. 
# Ex: ERROR: motter-image-minimal-1.0-r0 do_rootfs: Taskhash mismatch <hash_A> versus <hash_B> for <recipe_path>
# Base hash is calculated from variables that are used in the task script. 
# So if we use time-related variables like DATETIME, we will get this hash mismatch error. 
# To avoid this error you need to exclude variables from the hash calculation, with VarFlags.
# do_something[vardepsexclude]="DATETIME"
# In our case, "IMAGE_VERSION" can be infered from "DATETIME", so it the followin line is necessary
IMAGE_NAME[vardepsexclude] += "IMAGE_VERSION"

IMAGE_NAME = "${IMAGE_BASENAME}-${IMAGE_VERSION}"

inherit manifest_deploy