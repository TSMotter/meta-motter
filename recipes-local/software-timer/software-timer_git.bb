DESCRIPTION = "This is a simple recipe that downloads a C application from github and uses CMake to build it"
HOMEPAGE = "https://github.com/TSMotter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c05e5c78a0079a45cc8647dba69fcc06"

SRCREV = "0cfd49ae2241306478250bd30cf972a30f29088f"
PV = "from-git${SRCPV}"
SRC_URI = "git://github.com/TSMotter/software-timer;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

do_configure() {
    cmake -S ${S} -B ${B} -D TARGET_GROUP=example
}

do_compile() {
    cmake --build ${B} --parallel ${BB_NUMBER_THREADS}
}

do_install() {
    cmake --install ${B} --prefix=${D}
}