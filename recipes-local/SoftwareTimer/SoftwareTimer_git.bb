DESCRIPTION = "This is a simple recipe that downloads a C application from github and uses CMake to build it"
HOMEPAGE = "https://github.com/TSMotter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c05e5c78a0079a45cc8647dba69fcc06"

SRCREV = "8dcbd14c7eda6b31a485412fb8dd6500dca0c131"
PV = "0.1+git${SRCPV}"
SRC_URI = "git://github.com/TSMotter/SoftwareTimer;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

do_compile() {
    cmake -S ${S} -B ${B} -D TARGET_GROUP=release
    cmake --build ${B} --parallel ${BB_NUMBER_THREADS}
}


do_install() {
    install -d ${D}${bindir}
    install -m 0755 main ${D}${bindir}
}