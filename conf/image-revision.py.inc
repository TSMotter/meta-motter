def get_image_revision(d):
    import subprocess
    import os.path

    try:
        corebase = d.getVar('COREBASE', True)
        repo_abs_path = os.path.join(os.path.dirname(corebase), "meta-motter")

        res = subprocess.run(f"git describe --tags --dirty --always", cwd=repo_abs_path, capture_output = True, shell = True)
        if res.returncode == 0:
            return res.stdout.decode('UTF-8').strip()

    except:
        bb.warn("Could not determine image version based on the git repository. Will use fallback.")
        machine = d.getVar('MACHINE', True)
        datetime = d.getVar('DATETIME', True)
        return f"{machine}-{datetime}"