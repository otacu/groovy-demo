package com.example.groovydemo.pojo.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyComoneCreateOrderRequest implements Serializable {
    // 是否使用脚本写的类来取代原转换类
    private Boolean useScript;

    // 转换类的java代码，base64转码
    // cGFja2FnZSBjb20uZXhhbXBsZS5ncm9vdnlkZW1vLnRoaXJkLmNvbnZlcnQ7CmltcG9ydCBjb20uZXhhbXBsZS5ncm9vdnlkZW1vLnBvam8uY29tbW9uLk15T3JkZXJEZWxpdmVyeUluZm87CmltcG9ydCBjb20uZXhhbXBsZS5ncm9vdnlkZW1vLnBvam8uY29tbW9uLk15T3JkZXJJdGVtSW5mbzsKaW1wb3J0IGNvbS5leGFtcGxlLmdyb292eWRlbW8ucG9qby5jb21tb24uTXlPcmRlclB1c2hJbmZvOwppbXBvcnQgY29tLmV4YW1wbGUuZ3Jvb3Z5ZGVtby5wb2pvLmNvbW1vbi5NeVJlc3VsdDsKaW1wb3J0IGNvbS5leGFtcGxlLmdyb292eWRlbW8ucG9qby5jb21vbmUuQ29tT25lQ29uc2lnbmVlOwppbXBvcnQgY29tLmV4YW1wbGUuZ3Jvb3Z5ZGVtby5wb2pvLmNvbW9uZS5Db21PbmVDcmVhdGVPcmRlclJlcXVlc3Q7CmltcG9ydCBjb20uZXhhbXBsZS5ncm9vdnlkZW1vLnBvam8uY29tb25lLkNvbU9uZUl0ZW07CgppbXBvcnQgamF2YS5tYXRoLkJpZ0RlY2ltYWw7CmltcG9ydCBqYXZhLnV0aWwuQXJyYXlMaXN0OwppbXBvcnQgamF2YS51dGlsLkxpc3Q7CgpjbGFzcyBDb252ZXJ0Q29tb25lQ3JlYXRlT3JkZXIgewogICAgcHVibGljIE15UmVzdWx0IGNvbnZlcnQoTXlPcmRlclB1c2hJbmZvIG9yZGVyUHVzaEluZm8pIHsKICAgICAgIHRyeSB7CiAgICAgICAgICAgQ29tT25lQ3JlYXRlT3JkZXJSZXF1ZXN0IHJlcXVlc3QgPSBuZXcgQ29tT25lQ3JlYXRlT3JkZXJSZXF1ZXN0KCk7CiAgICAgICAgICAgTXlPcmRlckRlbGl2ZXJ5SW5mbyBvcmRlckRlbGl2ZXJ5ID0gb3JkZXJQdXNoSW5mby5nZXRPcmRlckRlbGl2ZXJ5KCk7CiAgICAgICAgICAgU3RyaW5nIHBvc3RDb2RlID0gb3JkZXJEZWxpdmVyeS5nZXRQb3N0Q29kZSgpOwogICAgICAgICAgIC8vIOWbveWutgogICAgICAgICAgIFN0cmluZyBjb3VudHJ5Q29kZSA9ICJNWSI7CiAgICAgICAgICAgTGlzdDxDb21PbmVJdGVtPiBjb21PbmVJdGVtTGlzdCA9IG5ldyBBcnJheUxpc3Q8PigpOwogICAgICAgICAgIExpc3Q8TXlPcmRlckl0ZW1JbmZvPiBvcmRlckl0ZW1MaXN0ID0gb3JkZXJQdXNoSW5mby5nZXRPcmRlckl0ZW1MaXN0KCk7CiAgICAgICAgICAgQm9vbGVhbiBpc0NoYXJnZSA9IGZhbHNlOwogICAgICAgICAgIEJvb2xlYW4gaXNTZWFTaGlwcGluZyA9IGZhbHNlOwogICAgICAgICAgIEJpZ0RlY2ltYWwgZXhjaGFuZ2VSYXRlID0gQmlnRGVjaW1hbC5PTkU7CiAgICAgICAgICAgQmlnRGVjaW1hbCBwYWNrYWdlV2VpZ2h0ID0gQmlnRGVjaW1hbC5aRVJPOwogICAgICAgICAgIGZvciAoTXlPcmRlckl0ZW1JbmZvIG9yZGVySXRlbSA6IG9yZGVySXRlbUxpc3QpIHsKICAgICAgICAgICAgICAgQ29tT25lSXRlbSBjb21PbmVJdGVtID0gbmV3IENvbU9uZUl0ZW0oKTsKICAgICAgICAgICAgICAgY29tT25lSXRlbS5zZXRDbmFtZShvcmRlckl0ZW0uZ2V0U2t1TmFtZSgpKTsKICAgICAgICAgICAgICAgY29tT25lSXRlbS5zZXROYW1lKG9yZGVySXRlbS5nZXRTa3VOYW1lKCkpOwogICAgICAgICAgICAgICBjb21PbmVJdGVtLnNldE51bWJlcihTdHJpbmcudmFsdWVPZihvcmRlckl0ZW0uZ2V0TnVtKCkpKTsKICAgICAgICAgICAgICAgRmxvYXQgdW5pdFByaWNlID0gbmV3IEJpZ0RlY2ltYWwob3JkZXJJdGVtLmdldFByaWNlKCkgLyAxMDAuMGYpCiAgICAgICAgICAgICAgICAgICAgICAgLm11bHRpcGx5KGV4Y2hhbmdlUmF0ZSkuc2V0U2NhbGUoMiwgQmlnRGVjaW1hbC5ST1VORF9ET1dOKS5mbG9hdFZhbHVlKCk7CiAgICAgICAgICAgICAgIGNvbU9uZUl0ZW0uc2V0VW5pdFByaWNlKHVuaXRQcmljZS50b1N0cmluZygpKTsKICAgICAgICAgICAgICAgY29tT25lSXRlbUxpc3QuYWRkKGNvbU9uZUl0ZW0pOwogICAgICAgICAgICAgICBCaWdEZWNpbWFsIGl0ZW1XZWlnaHQgPSBuZXcgQmlnRGVjaW1hbCgiMC4xIik7CiAgICAgICAgICAgICAgIHBhY2thZ2VXZWlnaHQuYWRkKGl0ZW1XZWlnaHQpOwogICAgICAgICAgIH0KICAgICAgICAgICBDb21PbmVDb25zaWduZWUgY29uc2lnbmVlID0gbmV3IENvbU9uZUNvbnNpZ25lZSgpOwogICAgICAgICAgIGNvbnNpZ25lZS5zZXROYW1lKG9yZGVyRGVsaXZlcnkuZ2V0TmFtZSgpKTsKICAgICAgICAgICBjb25zaWduZWUuc2V0Q29tcGFueShvcmRlckRlbGl2ZXJ5LmdldE5hbWUoKSk7CiAgICAgICAgICAgU3RyaW5nIHBob25lID0gb3JkZXJEZWxpdmVyeS5nZXRNb2JpbGUoKTsKICAgICAgICAgICBjb25zaWduZWUuc2V0UGhvbmUocGhvbmUpOwogICAgICAgICAgIGNvbnNpZ25lZS5zZXRBZGRyZXNzKG9yZGVyRGVsaXZlcnkuZ2V0QWRkcmVzcygpKTsKICAgICAgICAgICBjb25zaWduZWUuc2V0UG9zdGNvZGUob3JkZXJEZWxpdmVyeS5nZXRQb3N0Q29kZSgpKTsKICAgICAgICAgICBjb25zaWduZWUuc2V0Q2l0eShvcmRlckRlbGl2ZXJ5LmdldENpdHkoKSk7CiAgICAgICAgICAgY29uc2lnbmVlLnNldFN0YXRlKG9yZGVyRGVsaXZlcnkuZ2V0UHJvdmluY2UoKSk7CiAgICAgICAgICAgLy8g5rig6YGTCiAgICAgICAgICAgU3RyaW5nIGNoYW5uZWxJZCA9ICIxMjM0IjsKICAgICAgICAgICByZXF1ZXN0LnNldENvdW50cnkoY291bnRyeUNvZGUpOwogICAgICAgICAgIHJlcXVlc3Quc2V0Q2hhbm5lbElkKGNoYW5uZWxJZCk7CiAgICAgICAgICAgcmVxdWVzdC5zZXRPcmRlck5vKG9yZGVyUHVzaEluZm8uZ2V0T3JkZXIoKS5nZXRUaWQoKSk7CiAgICAgICAgICAgcmVxdWVzdC5zZXRDb3VudChTdHJpbmcudmFsdWVPZigxKSk7CiAgICAgICAgICAgcmVxdWVzdC5zZXRXZWlnaHQocGFja2FnZVdlaWdodC5zZXRTY2FsZSgyLCBCaWdEZWNpbWFsLlJPVU5EX0hBTEZfVVApLnRvU3RyaW5nKCkpOwogICAgICAgICAgIHJlcXVlc3Quc2V0SXRlbUxpc3QoY29tT25lSXRlbUxpc3QpOwogICAgICAgICAgIHJlcXVlc3Quc2V0Q29uc2lnbmVlKGNvbnNpZ25lZSk7CiAgICAgICAgICAgcmV0dXJuIE15UmVzdWx0Lm9rKHJlcXVlc3QpOwogICAgICAgfSBjYXRjaCAoRXhjZXB0aW9uIGUpIHsKICAgICAgICAgICByZXR1cm4gTXlSZXN1bHQuYnVpbGQoNDAwLCAi6L2s5o2i5byC5bi4IiwgbnVsbCk7CiAgICAgICB9CiAgICB9Cn0=
    private String convertScript;
}
