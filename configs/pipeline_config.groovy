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
  security_scan {
    css_scan
    sast_scan
    sca_scan
  }
}
