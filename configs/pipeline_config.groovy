jte {
  allow_scm_jenkinsfile = false
}

// template_methods {
// }

libraries {
  css
  sast
  sca
}

stages {
  @override build {}
  @merge test {}
  security_scan {
    css_scan
    sast_scan
    sca_scan
  }
  @merge publish_artifact {}
  @override deploy {}
}
