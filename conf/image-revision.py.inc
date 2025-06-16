def get_image_revision(d):
    import subprocess
    import os.path

    try:
        COREBASE = d.getVar('COREBASE', True)
        repo_abs_path = os.path.join(os.path.dirname(COREBASE), "meta-motter")

        res = subprocess.run(f"git describe --tags --dirty --always", cwd=repo_abs_path, capture_output = True, shell = True)
        if res.returncode == 0:
            return res.stdout.decode('UTF-8').strip()

    except:
        bb.warn("Could not determine image version based on the git repository. Using DATETIME instead.")
        return d.getVar('DATETIME', True)