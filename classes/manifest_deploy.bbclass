do_manifest_deploy[nostamp] = "1"

python do_manifest_deploy() {
    #bb.warn("This is do_manifest_deploy")

    imgdeploydir = d.getVar('IMGDEPLOYDIR', True)
    image_name = d.getVar('IMAGE_NAME', True)
    image_name_suffix = d.getVar('IMAGE_NAME_SUFFIX', True)
    source_file = f"{imgdeploydir}/{image_name}{image_name_suffix}.manifest"

    image_rootfs = d.getVar('IMAGE_ROOTFS', True)
    datadir = d.getVar('datadir', True)
    dest_dir = f"{image_rootfs}{datadir}"

    #bb.warn(f"This is source_file: {source_file}")
    #bb.warn(f"This is dest_dir: {dest_dir}")

    try:
        import subprocess
        res = subprocess.run(f"cp {source_file} {dest_dir}", capture_output = True, shell = True)
    except:
        bb.warn(f"Could not do_manifest_deploy. This is res.returncode: {res.returncode}")
}

addtask do_manifest_deploy after do_rootfs before do_image
