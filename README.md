firebase-authenticator
=======

Prerequisite
-------
- [Google AppEngine](https://cloud.google.com/appengine)
- [Google Endpoints](https://cloud.google.com/endpoints)
- [Google Guice](https://github.com/google/guice)
  - https://github.com/google/guice/wiki/GoogleAppEngine
- [Firebase Admin SDK](https://firebase.google.com/docs/admin/setup)
- [Microservice Auth](https://github.com/ceosilvajr/microservice-auth)

Changes you should make
-------
- `/src/main/webapp/WEB-INF/api-firebase.json`
- `/src/main/webapp/WEB-INF/appengine-web.xml`

How to Deploy
-------
- Development
  - `$ gradle appengineRun`
- Production
  - `$ gradle appengineDeploy`

License
-------

MIT License

Copyright (c) 2018 Ariel Silva Jr

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.