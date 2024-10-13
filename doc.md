# Documenting some of the steps and informations
```bash
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ bitbake software-timer
Loading cache: 100% |####################################################################################################################################################| Time: 0:00:00
Loaded 1335 entries from dependency cache.
Parsing recipes: 100% |##################################################################################################################################################| Time: 0:00:00
Parsing of 778 .bb files complete (777 cached, 1 parsed). 1334 targets, 59 skipped, 0 masked, 0 errors.
NOTE: Resolving any missing task queue dependencies

Build Configuration:
BB_VERSION           = "1.46.0"
BUILD_SYS            = "x86_64-linux"
NATIVELSBSTRING      = "universal"
TARGET_SYS           = "arm-poky-linux-gnueabi"
MACHINE              = "beaglebone-yocto"
DISTRO               = "poky"
DISTRO_VERSION       = "3.1.33"
TUNE_FEATURES        = "arm vfp cortexa8 neon callconvention-hard"
TARGET_FPU           = "hard"
meta                 
meta-poky            
meta-yocto-bsp       = "dunfell:63d05fc061006bf1a88630d6d91cdc76ea33fbf2"
meta-tsmotter        = "master:20b13fb260c0059605b86b95efc0051ccef3f85e"

Initialising tasks: 100% |###############################################################################################################################################| Time: 0:00:00
Sstate summary: Wanted 5 Found 0 Missed 5 Current 138 (0% match, 96% complete)
NOTE: Executing Tasks
NOTE: Tasks Summary: Attempted 579 tasks of which 572 didn't need to be rerun and all succeeded.
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ find . -iname "*software-timer*"
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.package_qa
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.package_write_rpm
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.deploy_source_date_epoch
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.package
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.populate_lic
./tmp/sstate-control/manifest-beaglebone_yocto-software-timer.packagedata
./tmp/sstate-control/manifest-cortexa8hf-neon-software-timer.populate_sysroot
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/software-timer.spec
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/sysroot-destdir/sysroot-providers/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime-reverse/software-timer-dev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime-reverse/software-timer-dbg
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime-reverse/software-timer-src
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime-reverse/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-doc.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-locale.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-dev.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-staticdev.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-src.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/extended/software-timer-dbg.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-dev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-staticdev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-dbg.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-dbg
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-dev.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-locale
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-src.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-src
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/runtime/software-timer-doc
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime-reverse/software-timer-dev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime-reverse/software-timer-dbg
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime-reverse/software-timer-src
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime-reverse/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-doc.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-locale.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-dev.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-staticdev.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-src.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/extended/software-timer-dbg.json.gz
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-dev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-staticdev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-dbg.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-dbg
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-dev.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-locale
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-src.packaged
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-src
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/runtime/software-timer-doc
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/pkgdata-pdata-input/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/deploy-rpms/cortexa8hf_neon/software-timer-dev-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/deploy-rpms/cortexa8hf_neon/software-timer-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/deploy-rpms/cortexa8hf_neon/software-timer-dbg-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/deploy-rpms/cortexa8hf_neon/software-timer-src-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-dev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer.shlibdeps
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-staticdev
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-dbg
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-locale
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-src
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-src/usr/src/debug/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/packages-split/software-timer-doc
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/package/usr/src/debug/software-timer
./tmp/work/cortexa8hf-neon-poky-linux-gnueabi/software-timer/0.1+gitAUTOINC+5d8327406d-r0/license-destdir/software-timer
./tmp/pkgdata/beaglebone-yocto/runtime-reverse/software-timer-dev
./tmp/pkgdata/beaglebone-yocto/runtime-reverse/software-timer-dbg
./tmp/pkgdata/beaglebone-yocto/runtime-reverse/software-timer-src
./tmp/pkgdata/beaglebone-yocto/runtime-reverse/software-timer
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-doc.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-locale.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-dev.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-staticdev.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-src.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer.json.gz
./tmp/pkgdata/beaglebone-yocto/extended/software-timer-dbg.json.gz
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-dev
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-staticdev
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer.packaged
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-dbg.packaged
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-dbg
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-dev.packaged
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-locale
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-src.packaged
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-src
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer
./tmp/pkgdata/beaglebone-yocto/runtime/software-timer-doc
./tmp/pkgdata/beaglebone-yocto/software-timer
./tmp/buildstats/20241012234913/software-timer-0.1+gitAUTOINC+5d8327406d-r0
./tmp/buildstats/20241012235346/software-timer-0.1+gitAUTOINC+5d8327406d-r0
./tmp/sysroots-components/cortexa8hf-neon/software-timer
./tmp/sysroots-components/cortexa8hf-neon/software-timer/sysroot-providers/software-timer
./tmp/stamps/cortexa8hf-neon-poky-linux-gnueabi/software-timer
./tmp/deploy/rpm/cortexa8hf_neon/software-timer-dev-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/deploy/rpm/cortexa8hf_neon/software-timer-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/deploy/rpm/cortexa8hf_neon/software-timer-dbg-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/deploy/rpm/cortexa8hf_neon/software-timer-src-0.1+git0+5d8327406d-r0.cortexa8hf_neon.rpm
./tmp/deploy/licenses/software-timer
./sstate-cache/1d/32/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:1d329888f84b3dc9e280da799de272931840606f31c0aebd7689eb993f125ad6_generate_toolchain_file.tgz.siginfo
./sstate-cache/56/ef/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:56ef2726b93dbd822dc2530dc23e174c377aa9c479ff3762c09ce6a6ef1a188a_compile.tgz.siginfo
./sstate-cache/b6/b1/sstate:software-timer::0.1+gitAUTOINC+5d8327406d:r0::3:b6b1349288cfa407733242d695cb0f9358ea3484529fec6c78247c64f0ac5844_patch.tgz.siginfo
./sstate-cache/70/20/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:70208b34bd17ba02d9ed2752617afbaa35f0e2d4efce66b6b3a95f2ff46680a7_package_qa.tgz.siginfo
./sstate-cache/70/20/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:70208b34bd17ba02d9ed2752617afbaa35f0e2d4efce66b6b3a95f2ff46680a7_package_qa.tgz
./sstate-cache/91/a5/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:91a52b51766c5edcdc57e534d5bf062f4a48d2031122470bd94454bcbe8b0e01_install.tgz.siginfo
./sstate-cache/93/cb/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:93cbc9d76257e31bc0daa91e41106d78f0a8305a0bc87e4a568214abfd85a479_deploy_source_date_epoch.tgz
./sstate-cache/93/cb/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:93cbc9d76257e31bc0daa91e41106d78f0a8305a0bc87e4a568214abfd85a479_deploy_source_date_epoch.tgz.siginfo
./sstate-cache/26/41/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:2641227db9c434760d50e918ed060e0f961886a6f34b74e11ca5941a440a42fa_configure.tgz.siginfo
./sstate-cache/6f/ac/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:6fac4b487c1cfa37837907730e94830d10a7b37f16f51a9a71d8255d4c657025_prepare_recipe_sysroot.tgz.siginfo
./sstate-cache/15/9a/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:159ada376d39a22b9715818d9c7e4c71b52e06a0df1f41cb3698636f63d78f09_package.tgz.siginfo
./sstate-cache/15/9a/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:159ada376d39a22b9715818d9c7e4c71b52e06a0df1f41cb3698636f63d78f09_package.tgz
./sstate-cache/43/06/sstate:software-timer::0.1+gitAUTOINC+5d8327406d:r0::3:430683dd1933074e577fc104d6c2455196086453a024d0b75eef48d23bffaf13_populate_lic.tgz.siginfo
./sstate-cache/43/06/sstate:software-timer::0.1+gitAUTOINC+5d8327406d:r0::3:430683dd1933074e577fc104d6c2455196086453a024d0b75eef48d23bffaf13_populate_lic.tgz
./sstate-cache/fd/fb/sstate:software-timer::0.1+gitAUTOINC+5d8327406d:r0::3:fdfbe054779cd97e71179dfa91eac44543fe23ec4f0cfe4f043b2792e29171e5_fetch.tgz.siginfo
./sstate-cache/b7/7b/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:b77b78635dca134b50ad963d69637acc0286190d3b543593d6b5aeb87ab966c6_packagedata.tgz.siginfo
./sstate-cache/b7/7b/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:b77b78635dca134b50ad963d69637acc0286190d3b543593d6b5aeb87ab966c6_packagedata.tgz
./sstate-cache/c9/13/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:c91345a115c2b94e3daca97b8eb1979c149c1df77de61f68d14974eacf3e0b04_package_write_rpm.tgz.siginfo
./sstate-cache/c9/13/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:c91345a115c2b94e3daca97b8eb1979c149c1df77de61f68d14974eacf3e0b04_package_write_rpm.tgz
./sstate-cache/0c/9b/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:0c9bd8928d96ea141f606e3372ed55f6c8b9d0e969443de97039aaf0588be7db_populate_sysroot.tgz
./sstate-cache/0c/9b/sstate:software-timer:cortexa8hf-neon-poky-linux-gnueabi:0.1+gitAUTOINC+5d8327406d:r0:cortexa8hf-neon:3:0c9bd8928d96ea141f606e3372ed55f6c8b9d0e969443de97039aaf0588be7db_populate_sysroot.tgz.siginfo
./sstate-cache/8e/3e/sstate:software-timer::0.1+gitAUTOINC+5d8327406d:r0::3:8e3e1501adcbde6ed76f75a55e68763d788651357e5816e62944e940a9da87c0_unpack.tgz.siginfo
```

- Further examples
```bash
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ bitbake-getvar -r tsmotter-image-minimal --value IMAGE_ROOTFS
/home/ggm/embedded-linux/poky/build/tmp/work/beaglebone_yocto-poky-linux-gnueabi/tsmotter-image-minimal/1.0-r0/rootfs
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ bitbake-getvar -r software-timer --value bindir
/usr/bin
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ ll tmp/work/beaglebone_yocto-poky-linux-gnueabi/tsmotter-image-minimal/1.0-r0/rootfs/usr/bin/software-timer 
-rwxr-xr-x 1 ggm ggm 5516 mar  9  2018 tmp/work/beaglebone_yocto-poky-linux-gnueabi/tsmotter-image-minimal/1.0-r0/rootfs/usr/bin/software-timer*
```

- And the output rootfs:
```bash
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ ll tmp/deploy/images/beaglebone-yocto/tsmotter-image-minimal-beaglebone-yocto.tar.bz2 
lrwxrwxrwx 2 ggm ggm 69 out 12 21:29 tmp/deploy/images/beaglebone-yocto/tsmotter-image-minimal-beaglebone-yocto.tar.bz2 -> tsmotter-image-minimal-beaglebone-yocto-20241013002908.rootfs.tar.bz2
```

- And the output image:
```bash
ggm@ubuntu2004:~/embedded-linux/poky/build (dunfell)$ ll tmp/deploy/images/beaglebone-yocto/tsmotter-image-minimal-beaglebone-yocto.wic
lrwxrwxrwx 2 ggm ggm 65 out 12 21:29 tmp/deploy/images/beaglebone-yocto/tsmotter-image-minimal-beaglebone-yocto.wic -> tsmotter-image-minimal-beaglebone-yocto-20241013002908.rootfs.wic
```