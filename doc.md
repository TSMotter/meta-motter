# Documenting some of the steps and informations

## Test - do_fetch()
- fetch:
```bash
ggm@ubuntu2004:~/embedded-linux/poky (dunfell)$ bitbake -c fetch SoftwareTimer
Loading cache: 100% |#####################################################################################| Time: 0:00:00
Loaded 1333 entries from dependency cache.
WARNING: /home/ggm/embedded-linux/poky/meta-tsmotter/recipes-local/SoftwareTimer/SoftwareTimer_git.bb: QA Issue: PN: SoftwareTimer is upper case, this can result in unexpected behavior. [uppercase-pn]
Parsing recipes: 100% |###################################################################################| Time: 0:00:00
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
meta-yocto-bsp       
meta-tsmotter        = "dunfell:63d05fc061006bf1a88630d6d91cdc76ea33fbf2"

Initialising tasks: 100% |################################################################################| Time: 0:00:00
Sstate summary: Wanted 0 Found 0 Missed 0 Current 0 (0% match, 0% complete)
NOTE: No setscene tasks
NOTE: Executing Tasks
WARNING: QA Issue: PN: SoftwareTimer is upper case, this can result in unexpected behavior. [uppercase-pn]
NOTE: Tasks Summary: Attempted 1 tasks of which 0 didn't need to be rerun and all succeeded.

Summary: There were 2 WARNING messages shown.
```
- Output
```bash
ggm@ubuntu2004:~/embedded-linux/poky (dunfell)$ find build -iname "*SoftwareTimer*"
build/tmp/work/cortexa8hf-neon-poky-linux-gnueabi/SoftwareTimer
build/tmp/buildstats/20241012214754/SoftwareTimer-0.1+gitAUTOINC+8dcbd14c7e-r0
build/tmp/stamps/cortexa8hf-neon-poky-linux-gnueabi/SoftwareTimer
build/downloads/git2/github.com.TSMotter.SoftwareTimer.done
build/downloads/git2/github.com.TSMotter.SoftwareTimer
build/sstate-cache/e2/a3/sstate:SoftwareTimer::0.1+gitAUTOINC+8dcbd14c7e:r0::3:e2a343e19568bd531efdb1e51cc2bef3ea0c76c9cf5eee12475fe2bff92747e4_fetch.tgz.siginfo
```