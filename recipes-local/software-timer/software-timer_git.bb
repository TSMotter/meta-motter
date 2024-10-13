DESCRIPTION = "This is a simple recipe that downloads a C application from github and uses CMake to build it"
HOMEPAGE = "https://github.com/TSMotter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c05e5c78a0079a45cc8647dba69fcc06"

SRCREV = "5d8327406dd60a785c8c2155b2a0217300f1467d"
PV = "0.1+git${SRCPV}"
SRC_URI = "git://github.com/TSMotter/SoftwareTimer;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

do_configure() {
    cmake -S ${S} -B ${B} -D TARGET_GROUP=release
}

do_compile() {
    cmake --build ${B} --parallel ${BB_NUMBER_THREADS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 src/main ${D}${bindir}/software-timer
}